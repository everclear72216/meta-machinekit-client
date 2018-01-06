DESCRIPTION = "A framework and base remote user interface for Machinekit"
HOMEPAGE = "https://github.com/qtquickvcp/QtQuickVcp"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL;md5=043dbcb497b881988ad067ec527b3df8"

DEPENDS += "qtbase qtquick1 qtdeclarative qtquickcontrols qtquickcontrols2 qttranslations qttools-native protobuf-native protobuf cppzmq"

SRC_URI = " \
    git://github.com/qtquickvcp/QtQuickVcp;branch=master \
    file://0001-qmake-remove-path-pollution-protobuf-pri.patch \
    "
SRC_URI[qtquickvcp.md5sum] = "4905243098ee1fcdf6c542cdf1f4267c"
SRC_URI[qtquickvcp.sha256sum] = "6174fe57975a3ab215ea6d8b7a8216ab93bf902f6a7ea76e235e6633fec46405" 

SRCREV = "af4b3d37b5d21984fad41ce653f94677bb15ff61"

S = "${WORKDIR}/git"

RDEPENDS_qtquickvcp += "qtbase qtquick1 qtdeclarative-qmlplugins qtquickcontrols-qmlplugins qtquickcontrols2-qmlplugins protobuf zeromq"

FILES_${PN} += " \
    ${datadir}/qt5/translations/servicedisplay_en.qm \
    ${datadir}/qt5/translations/servicedisplay_ru.qm \      
    ${datadir}/qt5/translations/servicedisplay_de.qm \      
    "

require recipes-qt/qt5/qt5.inc
