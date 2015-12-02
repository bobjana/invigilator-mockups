export class App {
  configureRouter(config, router) {
    config.title = 'Aurelia';
    config.map([
      { route: ['', 'home'], name: 'home', moduleId: 'home',      nav: true, title: 'Home' },
      { route: 'exams',  name: 'exam-list', moduleId: 'exams/list', nav: true, title: 'Exams' },
      { route: 'exams/create', name: 'exam-create', moduleId: 'exams/create', nav: false, title: 'Create New' },
    ]);

    this.router = router;
  }
}
