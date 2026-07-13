class Question {
    private int id;
    private String question;
    private int correctAnswer;
    private String[] options;

    public Question(int id, String question, int correctAnswer, String... options) {
        this.id = id;
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.options = options;
    }

    public String getQuestion() {
        return question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOptions(String... options) {
        this.options = options;
    }

    public String[] getOptions() {
        return options;
    }

    
 }