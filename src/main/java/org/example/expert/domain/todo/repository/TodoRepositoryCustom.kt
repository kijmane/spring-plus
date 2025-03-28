package org.example.expert.domain.todo.repository

import org.example.expert.domain.todo.dto.request.TodoSearchCondition
import org.example.expert.domain.todo.dto.response.TodoSearchResult
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface TodoRepositoryCustom {
    fun searchTodos(condition: TodoSearchCondition, pageable: Pageable): Page<TodoSearchResult>
}