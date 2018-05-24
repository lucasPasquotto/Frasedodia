package frasedodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoNovaFrase;
    private TextView textoNovaFrase;

    private String[] frases = {
            "“Controle o seu destino ou alguém controlará”. – Jack Welch",
            "“Empreendedores são aqueles que entendem que há uma pequena diferença entre obstáculos e oportunidades e são capazes de transformar ambos em vantagem”. – Maquiavel",
            "“A lógica pode levar de um ponto A a um ponto B. A imaginação pode levar a qualquer lugar” – Albert Einstein",
            "“Se falta de tempo realmente fosse uma justificativa para não realizar seus projetos, somente os desocupados teriam sucesso”. – Flávio Augusto da Silva",
            "“Se você criar um valor incrível e fornecer informações que podem mudar a vida de outras pessoas – e sempre manter o foco sobre o serviço – o sucesso financeiro virá como consequência”. – Brendon Burchard",
            "“Muitas das falhas da vida ocorrem quando não percebemos o quão próximos estávamos do sucesso na hora em que desistimos” – Thomas Edison",
            "“Se você traçar metas absurdamente altas e falhar, seu fracasso será muito melhor que o sucesso de todos” – James Cameron",
            "“Os empreendedores falham, em média, 3,8 vezes antes do sucesso final. O que separa os bem-sucedidos dos outros é a persistência” – Lisa M. Amos",
            "“Para de perseguir o dinheiro e comece a perseguir o sucesso” – Tony Hsieh",
            "“Há sempre fartura de capital à disposição dos que podem traçar planos práticos para serem levados a efeito” – Napoleon Hill"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);
        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomico = new Random();
                textoNovaFrase.setText(frases[randomico.nextInt(frases.length)]);
            }
        });


    }
}
