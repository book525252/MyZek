package com.it.myzek.home.presenter

import com.it.myzek.common.BaseView
import com.it.myzek.home.model.UserListModel
import com.it.myzek.home.model.UserModel


class UserContract {
    interface Presenter {

        fun addDefaultEmail()

        fun loadDataFormFirebase()

        fun removeItemMember(userId: String)
    }

    interface View : BaseView {

        fun updateData(model: UserModel)

        fun updateList(model: List<UserListModel>)

    }
}