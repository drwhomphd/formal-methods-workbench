/* This file has been autogenerated by Ivory
 * Compiler version  0.1.0.4
 */
#include "Server.h"

static void component_entry_aux(void);

static void component_entry_aux_2(void);

static void component_entry_aux_3(void);

void component_entry(const int64_t *n_var0)
{
    component_entry_aux();
    component_entry_aux_2();
    component_entry_aux_3();
    return;
}

void component_init(const int64_t *n_var0)
{ }

void component_entry_aux(void)
{
    uint8_t n_local0[80U] = {};
    uint8_t *n_ref1 = n_local0;
    bool n_r2 = tb_Server_read_decrypt2self(n_ref1);
    
    if (n_r2) {
        callback_input_tb_Server_read_decrypt2self_handler(n_ref1);
    }
    return;
}

void component_entry_aux_2(void)
{
    uint8_t n_local0[80U] = {};
    uint8_t *n_ref1 = n_local0;
    bool n_r2 = tb_Server_read_framing2self(n_ref1);
    
    if (n_r2) {
        callback_input_tb_Server_read_framing2self_handler(n_ref1);
    }
    return;
}

void component_entry_aux_3(void)
{
    struct SMACCM_DATA__Camera_Bounding_Box_i n_local0 = {};
    struct SMACCM_DATA__Camera_Bounding_Box_i *n_ref1 = &n_local0;
    bool n_r2 = tb_Server_read_vm2self(n_ref1);
    
    if (n_r2) {
        callback_input_tb_Server_read_vm2self_handler(n_ref1);
    }
    return;
}
