/* This file has been autogenerated by Ivory
 * Compiler version  0.1.0.5
 */
#include "px4flow_integral_sample_types.h"

void px4flow_integral_sample_get_le(const uint8_t *n_var0, uint32_t n_var1, struct px4flow_integral_sample *n_var2)
{
    ivory_serialize_unpack_uint16_le(n_var0, n_var1, &n_var2->frame_count_since_last_readout);
    ivory_serialize_unpack_int16_le(n_var0, (uint32_t) ((uint32_t) 2U + n_var1), &n_var2->pixel_flow_x_integral);
    ivory_serialize_unpack_int16_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 4U), &n_var2->pixel_flow_y_integral);
    ivory_serialize_unpack_int16_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 6U), &n_var2->gyro_x_rate_integral);
    ivory_serialize_unpack_int16_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 8U), &n_var2->gyro_y_rate_integral);
    ivory_serialize_unpack_int16_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 10U), &n_var2->gyro_z_rate_integral);
    ivory_serialize_unpack_uint32_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 12U), &n_var2->integration_timespan);
    ivory_serialize_unpack_uint32_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 16U), &n_var2->sonar_timestamp);
    ivory_serialize_unpack_int16_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 20U), &n_var2->ground_distance);
    ivory_serialize_unpack_int16_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 22U), &n_var2->gyro_temperature);
    ivory_serialize_unpack_uint8_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 24U), &n_var2->quality);
    ibool_get_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 25U), &n_var2->samplefail);
    time_micros_t_get_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 26U), &n_var2->time);
}

void px4flow_integral_sample_get_be(const uint8_t *n_var0, uint32_t n_var1, struct px4flow_integral_sample *n_var2)
{
    ivory_serialize_unpack_uint16_be(n_var0, n_var1, &n_var2->frame_count_since_last_readout);
    ivory_serialize_unpack_int16_be(n_var0, (uint32_t) ((uint32_t) 2U + n_var1), &n_var2->pixel_flow_x_integral);
    ivory_serialize_unpack_int16_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 4U), &n_var2->pixel_flow_y_integral);
    ivory_serialize_unpack_int16_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 6U), &n_var2->gyro_x_rate_integral);
    ivory_serialize_unpack_int16_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 8U), &n_var2->gyro_y_rate_integral);
    ivory_serialize_unpack_int16_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 10U), &n_var2->gyro_z_rate_integral);
    ivory_serialize_unpack_uint32_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 12U), &n_var2->integration_timespan);
    ivory_serialize_unpack_uint32_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 16U), &n_var2->sonar_timestamp);
    ivory_serialize_unpack_int16_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 20U), &n_var2->ground_distance);
    ivory_serialize_unpack_int16_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 22U), &n_var2->gyro_temperature);
    ivory_serialize_unpack_uint8_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 24U), &n_var2->quality);
    ibool_get_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 25U), &n_var2->samplefail);
    time_micros_t_get_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 26U), &n_var2->time);
}

void px4flow_integral_sample_set_le(uint8_t *n_var0, uint32_t n_var1, const struct px4flow_integral_sample *n_var2)
{
    ivory_serialize_pack_uint16_le(n_var0, n_var1, &n_var2->frame_count_since_last_readout);
    ivory_serialize_pack_int16_le(n_var0, (uint32_t) ((uint32_t) 2U + n_var1), &n_var2->pixel_flow_x_integral);
    ivory_serialize_pack_int16_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 4U), &n_var2->pixel_flow_y_integral);
    ivory_serialize_pack_int16_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 6U), &n_var2->gyro_x_rate_integral);
    ivory_serialize_pack_int16_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 8U), &n_var2->gyro_y_rate_integral);
    ivory_serialize_pack_int16_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 10U), &n_var2->gyro_z_rate_integral);
    ivory_serialize_pack_uint32_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 12U), &n_var2->integration_timespan);
    ivory_serialize_pack_uint32_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 16U), &n_var2->sonar_timestamp);
    ivory_serialize_pack_int16_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 20U), &n_var2->ground_distance);
    ivory_serialize_pack_int16_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 22U), &n_var2->gyro_temperature);
    ivory_serialize_pack_uint8_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 24U), &n_var2->quality);
    ibool_set_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 25U), &n_var2->samplefail);
    time_micros_t_set_le(n_var0, (uint32_t) (n_var1 + (uint32_t) 26U), &n_var2->time);
}

void px4flow_integral_sample_set_be(uint8_t *n_var0, uint32_t n_var1, const struct px4flow_integral_sample *n_var2)
{
    ivory_serialize_pack_uint16_be(n_var0, n_var1, &n_var2->frame_count_since_last_readout);
    ivory_serialize_pack_int16_be(n_var0, (uint32_t) ((uint32_t) 2U + n_var1), &n_var2->pixel_flow_x_integral);
    ivory_serialize_pack_int16_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 4U), &n_var2->pixel_flow_y_integral);
    ivory_serialize_pack_int16_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 6U), &n_var2->gyro_x_rate_integral);
    ivory_serialize_pack_int16_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 8U), &n_var2->gyro_y_rate_integral);
    ivory_serialize_pack_int16_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 10U), &n_var2->gyro_z_rate_integral);
    ivory_serialize_pack_uint32_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 12U), &n_var2->integration_timespan);
    ivory_serialize_pack_uint32_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 16U), &n_var2->sonar_timestamp);
    ivory_serialize_pack_int16_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 20U), &n_var2->ground_distance);
    ivory_serialize_pack_int16_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 22U), &n_var2->gyro_temperature);
    ivory_serialize_pack_uint8_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 24U), &n_var2->quality);
    ibool_set_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 25U), &n_var2->samplefail);
    time_micros_t_set_be(n_var0, (uint32_t) (n_var1 + (uint32_t) 26U), &n_var2->time);
}
