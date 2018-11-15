#!/bin/bash
#
# Module:  init-testshare.sh
# Description:
#    Prepare the testshare example: an example of a structure
# in shared memory.
#
# You must link this script and the projects/camkes/apps/testshare
# directory to the corresponding places in your camkes-project/
# directory.
#
# You may need to add the python-capdl-tool to your PYTHONPATH
# See example below.
#
# Run this from your camkes-project/ directory top level.
# It will create a build-directory "build-dpmon".
# Enter it, and run "ninja".  Then run "./simulate".

APP=testshare
BUILDDIR=./build-shm
PLAT=ia32

#--------------------------------------

HERE=`pwd`
export PYTHONPATH=${HERE}/projects/camkes/capdl/python-capdl-tool

set -e
rm -rf $BUILDDIR
mkdir  $BUILDDIR
cd $BUILDDIR

../init-build.sh -DPLATFORM=$PLAT -DCAMKES_APP=$APP 

echo "Done. Output in $BUILDDIR, ready for the ninja"
