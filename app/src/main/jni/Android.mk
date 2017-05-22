#指定编译的文件夹  指定当前文件目录
LOCAL_PATH := $(call my-dir)
#编译器会定义很多的临时变量，中间变量，最好清空所有的中间变量。
include $(CLEAR_VARS)
LOCAL_MODULE    := myndkform
LOCAL_SRC_FILES := myndkform.c
include $(BUILD_SHARED_LIBRARY)