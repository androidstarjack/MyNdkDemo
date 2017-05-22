//#include "_Included_com_yyh_ndk_study_ndk_MyNdkUtils.h"
#include <stdio.h>
#include <jni.h>


JNIEXPORT jstring JNICALL Java_com_yyh_ndk_study_ndk_MyNdkUtils_getMyHelloFormWrold (JNIEnv *env, jobject obj){
       // char* c = (*env)->NewStringUTF(env,"hello,my world");
        char* c =   (*(*env)).NewStringUTF(env,"hello,my world");
        return c;
};