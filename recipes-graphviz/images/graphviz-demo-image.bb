DESCRIPTION = "An image that will launch into the demo application for the embedded (not based on X11) version of Qt."
LICENSE = "MIT"
PR = "r1"
# add dot -c at init

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

IMAGE_FEATURES += "package-management x11-base"

PACKAGE_EXCLUDE = "xinit"

IMAGE_INSTALL += "\
    ${CORE_IMAGE_BASE_INSTALL} \
    graphviz \
    graphviz-doc \
    graphviz-dev \
"
 
inherit core-image distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"
