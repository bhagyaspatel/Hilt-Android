package com.bhagyapatel.hilt_cheezycode

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Named

@InstallIn(FragmentComponent::class)
@Module
//abstract class UserModule {
class UserModule {

    @Provides
    @Named("firebase")
    @FragmentScoped
    fun provideFirebaseUserRepository() : UserRepository{
        return FirebaseRepository()
    }

    @Provides
//    @Named("sql")
    @SQLQualifier //our own annotation : same as @Named() but to avoid typo mistakes
    fun provideSQLUserRepository(sqlRepository: SQLRepository) : UserRepository{
        return sqlRepository
    }

//    @Binds //same as just above one : Hilt provided @Bind() annotaion to increase readability
//    abstract fun bindsUserRepository(sqlRepository: SQLRepository) : UserRepository


}

// NOW ISS MODULE KO HUM COMPONENT KE SATH JODEGE : KONSE COMPONENT KE SATH JODNA HAI THAT WILL BE
// DECIDED BY KI KONSE LEVEL KA SCOPE REQUIRED HAI

// COMPONENT : BAG OG OBJECTS : WITH SCOPE DEFINE : HILT PROVIDES US WITH SUCH COMPONENTS; FRAGMENT,
// ACTIVITY, APPLICATION(SINGLETON)...

// TO SPECIFY THE COMPONENT IN MODULE WE USE @InstallIn() ANNOTATION

// TO FIND THE MODULE IMPLEMENTATION HILT WILL GO UPWARDS IN HIERARCHY :
//ie if we have injected it in activity it will go from Activity->Application not down to Fragment

// When there are more than one @Provides() annotations we have to use qualifiers; for that we have
// @Named() annotation to specify which implementation to use