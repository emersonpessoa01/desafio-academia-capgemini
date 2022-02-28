package br.com.emerson.desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesafioApplication.class, args);
        if(args[0].equals("desafioUm")){
            DesafioUm desafio = new DesafioUm();
            desafio.desafio1(args[1]);
        }
	    else if(args[0].equals("desafioDois")){
            DesafioDois desafio = new DesafioDois();
            desafio.desafio2(args[1]);
        }
	    else if(args[0].equals("desafioTres")){
            DesafioTres desafio = new DesafioTres();
            desafio.desafio3(args[1]);
        }
    }

}
