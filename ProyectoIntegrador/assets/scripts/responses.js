function getBotResponse(input) {
    //rock paper scissors
    if (input == "rock") {
        return "paper";
    } else if (input == "paper") {
        return "scissors";
    } else if (input == "scissors") {
        return "rock";
    }

    // Simple responses
    if (input == "hello") {
        return "Hello there!";
    } else if (input == "mascotas") {
        return "Puedes traer cualquier mascota siempre y cuando haya consentimiento";
    } else if (input == "horarios") {
        return "Solamente puedes hacer citas de 8 am a 8pm";
    }else {
        return "Puedes visitar nuestro sitio web";
    }
}