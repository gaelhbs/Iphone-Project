```mermaid
classDiagram
    class iPhone {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    classe ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    classe AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    classe NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    iPhone implements ReprodutorMusical
    iPhone implements AparelhoTelefonico
    iPhone implements NavegadorInternet
