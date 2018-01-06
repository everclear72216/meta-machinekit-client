DESCRIPTION = "MachinekitClient package"
LICENSE = "MIT"
PR = "r1"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

MB_MACHINEKITCLIENT_3RDPARTY = "\
    libsodium \
    zeromq \
    protobuf \
    "

MB_QTQUICKVCP = "\
    qtquickvcp \
    "

RDEPENDS_${PN} = "\
    ${MB_MACHINEKITCLIENT_3RDPARTY} \
    ${MB_QTQUICKVCP} \
    "
