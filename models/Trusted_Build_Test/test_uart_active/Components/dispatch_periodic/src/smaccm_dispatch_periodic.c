/**************************************************************************
  Copyright (c) 2013, 2014, 2015 Rockwell Collins and the University of Minnesota.
  Developed with the sponsorship of the Defense Advanced Research Projects Agency (DARPA).

  Permission is hereby granted, free of charge, to any person obtaining a copy of this data,
  including any software or models in source or binary form, as well as any drawings, specifications, 
  and documentation (collectively "the Data"), to deal in the Data without restriction, including 
  without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
  and/or sell copies of the Data, and to permit persons to whom the Data is furnished to do so, 
  subject to the following conditions: 

  The above copyright notice and this permission notice shall be included in all copies or
  substantial portions of the Data.

  THE DATA IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT 
  LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
  IN NO EVENT SHALL THE AUTHORS, SPONSORS, DEVELOPERS, CONTRIBUTORS, OR COPYRIGHT HOLDERS BE LIABLE 
  FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, 
  ARISING FROM, OUT OF OR IN CONNECTION WITH THE DATA OR THE USE OR OTHER DEALINGS IN THE DATA. 

 **************************************************************************/


/**************************************************************************

   File: C:\Users\jdbackes\git\smaccm\models\Trusted_Build_Test\test_uart_active\components\dispatch_periodic\src\smaccm_dispatch_periodic.c
   Created on: 2015/04/09 14:16:46
   using Dulcimer AADL system build tool suite 

   ***AUTOGENERATED CODE: DO NOT MODIFY***

  This .c file contains the CAmkES periodic dispatcher component definition.

 **************************************************************************/

#include <smaccm_test_uart_impl_types.h>
#include <clock_driver.h>

#include <string.h>

#include <dispatch_periodic.h>
// Declarations for managing periodic thread dispatch
const uint32_t smaccm_tick_interval = 100;
const uint32_t smaccm_hyperperiod_subdivisions = 1;
uint32_t smaccm_calendar_counter = 0;
uint32_t smaccm_calendar_ticks = 0;


void smaccm_thread_calendar() {
	if ((smaccm_calendar_counter % (100 / smaccm_tick_interval)) == 0) {
		uint64_t the_time = clock_get_time();
		sender_periodic_100_ms_write_uint64_t(&the_time); 
	}

	smaccm_calendar_counter = (smaccm_calendar_counter + 1) % smaccm_hyperperiod_subdivisions; 
	smaccm_calendar_ticks++; 
}

void smaccm_periodic_irq_callback() {
	clock_irq_callback();
	smaccm_thread_calendar(); 
	irq_reg_callback(smaccm_periodic_irq_callback, NULL);
}

int run(void)
{
	irq_reg_callback(smaccm_periodic_irq_callback, NULL);
	clock_init();
	clock_set_interval_in_ms(100);

	clock_start_timer();

	return 0;
}
 /**************************************************************************
  End of autogenerated file: C:\Users\jdbackes\git\smaccm\models\Trusted_Build_Test\test_uart_active\components\dispatch_periodic\src\smaccm_dispatch_periodic.c
 **************************************************************************/

