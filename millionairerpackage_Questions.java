package millionairerpackage;

class Questions {
    private String questions;
    private String answer;
    private String[] options;

    Questions(String questions, String answer, String[] options) {
        this.questions = questions;
        this.answer = answer;
        this.options = options;
    }

    String getQuestions() {
        return questions;
    }

    String getAnswer() {
        return answer;
    }

    String[] getOptions() {
        return options;
    }
}
