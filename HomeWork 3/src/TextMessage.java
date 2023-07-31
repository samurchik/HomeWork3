public class TextMessage {
    private String message;

    // Конструктор по умолчанию
    public TextMessage() {
    }

    // Конструктор с одним аргументом типа String
    public TextMessage(String message) {
        setMessage(message);
    }

    // Метод для установки сообщения с заменой матерных слов на звездочки
    public void setMessage(String message) {
        this.message = message.replaceAll("\\bfuck\\b|bullshit", "****");
    }

    // Метод для получения текста сообщения
    public String getMessage() {
        return message;
    }
}
