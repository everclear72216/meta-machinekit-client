SUMMARY = "Martin Bertsche's Beaglebone Black image for MachinekitClient"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta-machinekit-client/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

require recipes-qt/images/mb-bbb-image-qt.bb

IMAGE_INSTALL += "\
    packagegroup-mb-machinekit-client \    
    "
