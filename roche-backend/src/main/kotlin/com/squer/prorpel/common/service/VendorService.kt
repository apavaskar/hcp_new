package com.squer.prorpel.common.service

interface VendorService {

    fun updateCreatedBy(oldId: String, newId: String)

    fun updateUpdatedBy(oldId: String, newId: String)

    fun updateActionBy(oldId: String, newId: String)

    fun updateOldCreatedBy(userId: String)
}