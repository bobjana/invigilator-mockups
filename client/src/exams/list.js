import {inject} from 'aurelia-framework';
import {DialogService} from 'aurelia-dialog';
import {CreateExam} from './create';

@inject(DialogService)
export class ExamList {

  constructor(dialogService) {
    this.dialogService = dialogService;
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


  exams = [
    {name: 'January 2016', status: 'Pending'},
    {name: 'January 2015', status: 'Archived'},
    {name: 'June 2015', status: 'Locked'}
  ]

}

