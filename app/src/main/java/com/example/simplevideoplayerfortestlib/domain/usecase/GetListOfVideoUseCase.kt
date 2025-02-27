package com.example.simplevideoplayerfortestlib.domain.usecase

import com.example.simplevideoplayerfortestlib.domain.models.VideoItem
import com.example.simplevideoplayerfortestlib.domain.repository.UserRepository

class GetListOfVideoUseCase(private val userRepository: UserRepository) {

    suspend fun execute(): List<VideoItem> {
        return userRepository.getListOfVideo()
    }
}