/* This file has been autogenerated by Ivory
 * Compiler version  0.1.0.5
 */
#include "stab_config_types.h"

void stab_config_get_le(const uint8_t *n_var0, uint32_t n_var1, struct stab_config *n_var2)
{
    pid_config_get_le(n_var0, n_var1, &n_var2->pos);
    pid_config_get_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 32U), &n_var2->rate);
}

void stab_config_get_be(const uint8_t *n_var0, uint32_t n_var1, struct stab_config *n_var2)
{
    pid_config_get_be(n_var0, n_var1, &n_var2->pos);
    pid_config_get_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 32U), &n_var2->rate);
}

void stab_config_set_le(uint8_t *n_var0, uint32_t n_var1, const struct stab_config *n_var2)
{
    pid_config_set_le(n_var0, n_var1, &n_var2->pos);
    pid_config_set_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 32U), &n_var2->rate);
}

void stab_config_set_be(uint8_t *n_var0, uint32_t n_var1, const struct stab_config *n_var2)
{
    pid_config_set_be(n_var0, n_var1, &n_var2->pos);
    pid_config_set_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 32U), &n_var2->rate);
}
