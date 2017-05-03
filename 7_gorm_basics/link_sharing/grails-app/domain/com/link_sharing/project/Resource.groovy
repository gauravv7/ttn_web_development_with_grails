package com.link_sharing.project

import com.link_sharing.project.User as User
import com.link_sharing.project.Topic as Topic
import com.link_sharing.project.ResourceRating as ResourceRating
import com.link_sharing.project.ReadingItem as ReadingItem

abstract class Resource {

    String description
    User createdBy
    Topic topic
    Date dateCreated
    Date lastUpdated

    static hasMany = [
            ratings : ResourceRating,
            readingItems: ReadingItem
    ]

    static mapping = {
        description(type: 'text')
    }

    static belongsTo = [topic: Topic]

    static constraints = {
        description(blank: false)
    }

    String toString() {
        return "${description}"
    }
}