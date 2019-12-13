package com.it.myzek.home

import com.it.myzek.home.model.UserListModel


interface UserCallback {
    fun onSelectItem(userListModel: UserListModel?)
    fun onSelectItemLongClick(userListModel: UserListModel?)
}