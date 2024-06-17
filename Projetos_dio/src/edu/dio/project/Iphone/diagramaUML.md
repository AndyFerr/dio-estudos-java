classDiagram
    class ReprodutorMusical {
        -String estado

        +tocar()
        +pausar()
        +selecionarMusica(int musica)
    }

    class AparelhoTelefonico {
        +ligar(int numero)
        +atender()
        +iniciarCorreioVoz()
        
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        atualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
