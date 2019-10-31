package com.antropov.talk.data

class Repository {

  var index = 0

  val items: MutableList<Item> = ArrayList()

  fun increment(toString: String, toString1: String) {
    index += 1
    items.add(Item(index))
  }

  fun clear() {
    index = 0
    items.clear()
  }

  companion object {

    @Volatile
    private var INSTANCE: Repository? = null

    fun getInstance(): Repository {
      if (INSTANCE == null) {
        INSTANCE = Repository()
      }
      return INSTANCE as Repository
    }
  }
}