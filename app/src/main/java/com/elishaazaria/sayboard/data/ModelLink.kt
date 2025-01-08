package com.elishaazaria.sayboard.data

import java.util.*

// Locale list available at: https://stackoverflow.com/questions/7973023/what-is-the-list-of-supported-languages-locales-on-android
/**
 *
 */
enum class ModelLink(
    val link: String,
    val locale: Locale
) {
    ENGLISH_US(
        "https://alphacephei.com/vosk/models/vosk-model-small-en-us-0.15.zip",
        Locale.US
    )
    ENGLISH_GB(
        "https://alphacephei.com/vosk/models/vosk-model-small-en-gb-0.15.zip",
        Locale("en", "GB")
    ),
    ENGLISH_IN(
        "https://alphacephei.com/vosk/models/vosk-model-small-en-in-0.4.zip",
        Locale("en", "IN")
    ),
    CHINESE(
        "https://alphacephei.com/vosk/models/vosk-model-small-cn-0.22.zip",
        Locale.CHINESE
    ),
    RUSSIAN(
        "https://alphacephei.com/vosk/models/vosk-model-small-ru-0.22.zip",
        Locale("ru")
    ),
    FRENCH(
        "https://alphacephei.com/vosk/models/vosk-model-small-fr-0.22.zip",
        Locale.FRENCH
    ),
    GERMAN(
        "https://alphacephei.com/vosk/models/vosk-model-small-de-0.15.zip",
        Locale.GERMAN
    ),
    SPANISH(
        "https://alphacephei.com/vosk/models/vosk-model-small-es-0.42.zip",
        Locale("es")
    ),
    PORTUGUESE(
        "https://alphacephei.com/vosk/models/vosk-model-small-pt-0.3.zip",
        Locale("pt")
    ),
    TURKISH(
        "https://alphacephei.com/vosk/models/vosk-model-small-tr-0.3.zip",
        Locale("tr")
    ),
    VIETNAMESE(
        "https://alphacephei.com/vosk/models/vosk-model-small-vn-0.3.zip",
        Locale("vi")
    ),
    ITALIAN(
        "https://alphacephei.com/vosk/models/vosk-model-small-it-0.22.zip",
        Locale.ITALIAN
    ),
    DUTCH(
        "https://alphacephei.com/vosk/models/vosk-model-small-nl-0.22.zip",
        Locale("nl")
    ),
    CATALAN(
        "https://alphacephei.com/vosk/models/vosk-model-small-ca-0.4.zip",
        Locale("ca")
    ),
    PERSIAN(
        "https://alphacephei.com/vosk/models/vosk-model-small-fa-0.4.zip",
        Locale("fa")
    ),
    KAZAKH(
        "https://alphacephei.com/vosk/models/vosk-model-small-kz-0.15.zip",
        Locale("kk")
    ),
    JAPANESE(
        "https://alphacephei.com/vosk/models/vosk-model-small-ja-0.22.zip",
        Locale.JAPANESE
    ),
    ESPERANTO(
        "https://alphacephei.com/vosk/models/vosk-model-small-eo-0.42.zip",
        Locale("eo")
    ),
    HINDI(
        "https://alphacephei.com/vosk/models/vosk-model-small-hi-0.22.zip",
        Locale("hi")
    ),
    CZECH(
        "https://alphacephei.com/vosk/models/vosk-model-small-cs-0.4-rhasspy.zip",
        Locale("cs")
    ),
    POLISH(
        "https://alphacephei.com/vosk/models/vosk-model-small-pl-0.22.zip",
        Locale("pl")
    ),
    UKRAINIAN(
        "https://alphacephei.com/vosk/models/vosk-model-small-uk-v3-small.zip",
        Locale("uk")
    );

    val filename: String
        get() = link.substring(link.lastIndexOf('/') + 1, link.lastIndexOf('.'))
}
