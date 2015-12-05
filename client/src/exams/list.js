import {inject} from 'aurelia-framework';
import {DialogService} from 'aurelia-dialog';
import {CreateExam} from './create';
import {HttpClient} from 'aurelia-fetch-client';
import 'fetch';

@inject(DialogService, HttpClient)
export class ExamList {

  exams = [];

  constructor(dialogService, httpClient) {
    this.dialogService = dialogService;
    httpClient.configure(config => {
      config
        .useStandardConfiguration()
        .withBaseUrl('http://localhost:8080/api/');
    });
    this.httpClient = httpClient;
  }

  activate() {
    this.httpClient.fetch('exams')
      .then(response => response.json())
      .then(data => {
        this.exams = data;
      });
  }


  createNewExam(){

    this.dialogService.open({ viewModel: CreateExam, model: { firstName: 'Owen' }}).then((result) => {
      if (!result.wasCancelled) {
        console.log('good');
        console.log(result.output);
      } else {
        console.log('bad');
      }
    });
  }

  //configureRouter(config, router) {
  //  config.map([
  //    { route: ['', 'exams/create'], name: 'exam-create', moduleId: 'exams/create', nav: true, title: 'Create New' },
  //  ]);
  //
  //  this.router = router;
  //}



}

