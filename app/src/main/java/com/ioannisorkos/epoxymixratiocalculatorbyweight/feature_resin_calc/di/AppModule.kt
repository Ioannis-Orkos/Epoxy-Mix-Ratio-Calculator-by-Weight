package com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.di

import android.app.Application
import androidx.room.Room
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.data.local.ResinDatabase
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.data.repository.ResinRepositoryImpl
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.repository.ResinRepository
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.usecase.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideResinDatabase(app: Application): ResinDatabase {
        return Room.databaseBuilder(
            app,
            ResinDatabase::class.java,
            ResinDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideResinRepository(db: ResinDatabase): ResinRepository {
        return ResinRepositoryImpl(db.resinDao)
    }


    @Provides
    @Singleton
    fun provideResinUseCases(repository: ResinRepository): ResinUseCases {
        return ResinUseCases(

            addResin = AddResin(repository),
            updateResin = UpdateResin(repository),
            getResins = GetResins(repository),
            getResinById = GetResinById(repository),
            delResin =  DelResin(repository),

            addMixHistory = AddMixHistory(repository),
            getResinsWithHistory = GetResinsWithHistory(repository),
            getResinsWithHistoryByID = GetResinsWithHistoryByID(repository)

        )
    }

}