package gk.trello

fun main(args: Array<String>) {
    val columnId: String = System.getenv("COLUMN_ID")
    val trelloKey: String = System.getenv("TRELLO_KEY")
    val trelloToken: String = System.getenv("TRELLO_TOKEN")

    callApi("https://api.trello.com/1/lists/$columnId/archiveAllCards?key=$trelloKey&token=$trelloToken")
}

fun callApi(url: String) {
    khttp.async.post(url,
            onError = {
                println("Column 'Done' was not cleaned")
                println("Error message: $message")
            },
            onResponse = {
                println("Column 'Done' was cleaned")
            }
    )
}