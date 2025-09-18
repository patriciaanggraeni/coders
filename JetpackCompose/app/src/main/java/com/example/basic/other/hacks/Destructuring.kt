package com.example.basic.other.hacks

// membuat data class User
data class User(
    val id: Int,
    val name: String,
    val isOnline: Boolean // variabel ini yang akan di-detructuring
)

fun messageOnlineUsers(usersInRoom: List<User>, message: String) {

    // membuat partisi untuk membagi user yang online dan offline
    // kembaliannya akan menjadi Pair<List<User>, List<User>>
    val partitionedUser = usersInRoom.partition { it.isOnline }

    // first berarti user yang sedang online/true
    partitionedUser.first.forEach { user ->

        // mengirim pesan ke user online
        user.sendMessage(message)
    }

    // second berarti user yang sedang offline/false
    partitionedUser.second.forEach { user ->
        // lakukan sesuatu
    }

    // -------------------------------------------------
    // variabel partitionedUser bisa dipecah menjadi dua
    // caranya dengan destructuring
    val (onlineUser, offlineUser) = usersInRoom.partition { it.isOnline }

    // lakukan foreach seperti biasa
    onlineUser.forEach { user ->
        user.sendMessage(message)
    }

    offlineUser.forEach {  user ->
        // lakukan sesuatu
    }

}

private fun User.sendMessage(message: String) {
    // mengirim pesan...
}