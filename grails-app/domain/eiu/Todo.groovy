package eiu

class Todo {

  boolean completed = false
  int ordering
  String text

  static constraints = {
    text nullable: false, empty: false
  }
}
