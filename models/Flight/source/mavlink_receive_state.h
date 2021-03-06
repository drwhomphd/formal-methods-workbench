/* This file has been autogenerated by Ivory
 * Compiler version  0.1.0.0
 */
#ifndef __MAVLINK_RECEIVE_STATE_H__
#define __MAVLINK_RECEIVE_STATE_H__
#ifdef __cplusplus
extern "C" {
#endif
#include "ivory.h"
struct mavlink_receive_state {
    uint8_t status;
    uint8_t offs;
    uint8_t paylen;
    uint8_t seqnum;
    uint8_t sysid;
    uint8_t compid;
    uint8_t msgid;
    uint8_t payload[256U];
    uint16_t crc;
} __attribute__((__packed__));

#ifdef __cplusplus
}
#endif
#endif /* __MAVLINK_RECEIVE_STATE_H__ */