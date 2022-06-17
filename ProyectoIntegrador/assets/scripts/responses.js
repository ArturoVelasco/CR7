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
    if (input == "Hola") {
        return "Hola buen día";
    } else if (input == "hola") {
        return "Hola buen día";
    } else if(input == "mascotas") {
        return "Puedes traer cualquier mascota siempre y cuando haya consentimiento";
    } else if (input == "Mascotas") {
        return "Hola buen día";
    }else if (input == "Horarios") {
        return "Solamente puedes hacer citas de 8 am a 8pm";
    }else if (input == "horarios") {
        return "Solamente puedes hacer citas de 8 am a 8pm";
    }else if (input == "Adopciones") {
        return "Adopa y cambia una vida, vísitanos en nuestros eventos para más información";
    }else if (input == "adopciones") {
        return "Adopa y cambia una vida, vísitanos en nuestros eventos para más información";
    }else if (input == "eventos") {
        return "Si quieres acudir algún evento como voluntariado, síguenos o ve a PETHOPEMTY en instagram para más información";
    }else if (input == "Eventos") {
        return "Si quieres acudir algún evento como voluntariado, síguenos o ve a PETHOPEMTY en instagram para más información";
    }else {
        return "Puedes visitar nuestro sitio web o probar otras palabras como adopciones o eventos";
    }
}