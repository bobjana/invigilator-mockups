export class Exam {

    days = [
        {
            date: '20 Oct 2015', venue: 'LC', sessions: [
            {slot: '1'},
            {slot: '2'},
            {slot: '3'}
        ]
        },
        {
            date: '20 Oct 2015', venue: 'D-501', sessions: [
            {slot: '1'},
            {slot: '2'},
            {slot: '3'}
        ]
        },
        {
            date: '21 Oct 2015', venue: 'LC', sessions: [
            {slot: '1'},
            {slot: '2'},
        ]
        },
        {
            date: '22 Oct 2015', venue: 'LC', sessions: [
            {slot: '1'},
        ]
        }
    ];


    //configureRouter(config, router) {
    //    config.map([
    //        { route: 'users',         name: 'users',         moduleId: 'users',         nav: true, title: 'Github Users' }
    //    ]);
    //
    //    this.router = router;
    //}


    activate(params, routeConfig, navigationInstruction) {
        console.log("---->");
        //sessionColSize = 12 / sessions.length;
    }
}

//export class UpperValueConverter {
//  toView(value) {
//    return value && value.toUpperCase();
//  }
//}
