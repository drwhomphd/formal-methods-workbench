/* This file has been autogenerated by Ivory
 * Compiler version  0.1.0.0
 */
#ifndef __MAVLINK_STATUSTEXT_MSG_H__
#define __MAVLINK_STATUSTEXT_MSG_H__
#ifdef __cplusplus
extern "C" {
#endif
#include "ivory.h"
#include "mavlinkSendModule.h"
#include "mavlink_pack_ivory.h"
struct statustext_msg {
    uint8_t severity;
    uint8_t text[50U];
} __attribute__((__packed__));
void mavlink_statustext_msg_send(const struct statustext_msg* n_var0,
                                 uint8_t* n_var1, uint8_t n_var2[80U]);
void mavlink_statustext_unpack(struct statustext_msg* n_var0, const
                               uint8_t* n_var1);

#ifdef __cplusplus
}
#endif
#endif /* __MAVLINK_STATUSTEXT_MSG_H__ */