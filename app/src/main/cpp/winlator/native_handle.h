/*
 * Minimal native_handle_t definition derived from Android Open Source Project.
 * SPDX-License-Identifier: Apache-2.0
 *
 * This project only needs the public layout to inspect numFds/data returned by
 * AHardwareBuffer_getNativeHandle. Platform-only libcutils helpers are not used.
 */
#ifndef POCKET_RUNTIME_NATIVE_HANDLE_H
#define POCKET_RUNTIME_NATIVE_HANDLE_H

#ifdef __cplusplus
extern "C" {
#endif

typedef struct native_handle {
    int version;
    int numFds;
    int numInts;
#if defined(__clang__)
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wzero-length-array"
#endif
    int data[0];
#if defined(__clang__)
#pragma clang diagnostic pop
#endif
} native_handle_t;

#ifdef __cplusplus
}
#endif

#endif
