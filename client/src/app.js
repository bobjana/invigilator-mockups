export class App {
  configureRouter(config, router) {
    config.title = 'Aurelia';
    config.map([
      { route: ['', 'home'], name: 'home',      moduleId: 'home',      nav: true, title: 'Home' },
      { route: 'exams',  name: 'exam', moduleId: 'exams/exam', nav: true, title: 'Exams' }
    ]);

    this.router = router;
  }
}
