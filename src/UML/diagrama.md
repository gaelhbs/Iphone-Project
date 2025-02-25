```mermaid
classDiagram
    class iPhone {
        +play()
        +pause()
        +selectMusic(String music)
        +call(String number)
        +answerCall()
        +startVoicemail()
        +displayPage(String url)
        +addNewTab()
        +updatePage()
    }

    class MusicalReproductor {
        +play()
        +pause()
        +selectMusic(String music)
    }

    class TelephoneDevice {
        +call(String number)
        +answerCall()
        +startVoicemail()
    }

    class InternetBrowser {
        +displayPage(String url)
        +addNewTab()
        +updatePage()
    }

    MusicalReproductor <|-- iPhone
    TelephoneDevice <|-- iPhone
    InternetBrowser  <|-- iPhone
```