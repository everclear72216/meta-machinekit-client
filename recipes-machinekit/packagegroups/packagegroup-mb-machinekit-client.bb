DESCRIPTION = "MachinekitClient package"
LICENSE = "MIT"
PR = "r1"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

MB_MACHINEKITCLIENT_3RDPARTY = "\
    zeromq \
    protobuf \
    "

RDEPENDS_${PN} = "\
    ${MB_MACHINECLIENT_3RDPARTY} \
    "
