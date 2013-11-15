package eiu

import grails.converters.JSON

class TodoController {

  def index() {
    println 'List'
    render(Todo.list() as JSON)
  }

  def show() {
    println 'Show'
    def todo = Todo.get(params.id) ?: []
    render(todo as JSON)
  }
}
