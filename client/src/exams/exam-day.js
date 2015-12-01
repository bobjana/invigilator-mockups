import {customElement, bindable} from 'aurelia-framework';

@customElement('exam-day')
export class ExamDay {

    @bindable date;
    @bindable venue;
    @bindable sessions;

    sessionColSize = 3;

    viewSession(session) {
        console.log(session);
        //$parent.router.navigateToRoute('view-session', { id: 123 })
    }

    //get sessionColSize() {
    //    console.log("---->" + sessions.length);
    //    return 12 / sessions.length;
    //}
}

