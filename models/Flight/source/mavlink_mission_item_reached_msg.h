/* This file has been autogenerated by Ivory
 * Compiler version  0.1.0.0
 */
#ifndef __MAVLINK_MISSION_ITEM_REACHED_MSG_H__
#define __MAVLINK_MISSION_ITEM_REACHED_MSG_H__
#ifdef __cplusplus
extern "C" {
#endif
#include "ivory.h"
#include "mavlinkSendModule.h"
#include "mavlink_pack_ivory.h"
struct mission_item_reached_msg {
    uint16_t mission_item_reached_seq;
} __attribute__((__packed__));
void mavlink_mission_item_reached_msg_send(const
                                           struct mission_item_reached_msg* n_var0,
                                           uint8_t* n_var1,
                                           uint8_t n_var2[80U]);
void mavlink_mission_item_reached_unpack(struct mission_item_reached_msg* n_var0,
                                         const uint8_t* n_var1);

#ifdef __cplusplus
}
#endif
#endif /* __MAVLINK_MISSION_ITEM_REACHED_MSG_H__ */