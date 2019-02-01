/* This file has been autogenerated by Ivory
 * Compiler version  0.1.0.3
 */
#ifndef __CONTROL_LAW_TYPES_H__
#define __CONTROL_LAW_TYPES_H__
#ifdef __cplusplus
extern "C" {
#endif
#include "arming_mode_types.h"
#include "control_modes_types.h"
#include "ivory.h"
#include "ivory_serialize.h"
typedef struct control_law { uint8_t arming_mode;
                             struct control_modes control_modes;
} control_law;
void control_law_get_le(const uint8_t *n_var0, uint32_t n_var1, struct control_law *n_var2);
void control_law_get_be(const uint8_t *n_var0, uint32_t n_var1, struct control_law *n_var2);
void control_law_set_le(uint8_t *n_var0, uint32_t n_var1, const struct control_law *n_var2);
void control_law_set_be(uint8_t *n_var0, uint32_t n_var1, const struct control_law *n_var2);

#ifdef __cplusplus
}
#endif
#endif /* __CONTROL_LAW_TYPES_H__ */