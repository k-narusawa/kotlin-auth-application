package com.example.kotlinapplication.adapter.infrastructure.mapper

import com.example.kotlinapplication.domain.user.todo.UserToDoEntity
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.session.RowBounds

@Mapper
interface UserToDoMapper {
  fun findByUserId(userId: String): List<UserToDoEntity>
  fun findByUserIdAndKeywordAndDoneFlg(
    userId: String,
    keyword: String?,
    doneFlg: Boolean?,
    rowBounds: RowBounds
  ): List<UserToDoEntity>

  fun findByUserIdAndToDoId(userId: String, todoId: Long): UserToDoEntity?
  fun save(userToDoEntity: UserToDoEntity)
  fun update(userToDoEntity: UserToDoEntity)
  fun deleteByUserIdAndToDoId(userId: String, todoId: Long)
}