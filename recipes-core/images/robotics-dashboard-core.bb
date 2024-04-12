# robotics-dashboard-core.bb

require recipes-core/images/core-image-minimal.bb

DESCRIPTION = "Robotics Dashboard core packages to be installed for all target platforms"
LICENSE = "MIT"

IMAGE_INSTALL:append = " iproute2 iptables bash cri-o bridge-utils wireguard-tools chrony openssh python3-json python3-dotenv python3-logging docker docker-compose"
IMAGE_INSTALL:append:aarch64 = " kernel-module-bridge"
IMAGE_ROOTFS_EXTRA_SPACE:append = " + 262144"

IMAGE_INSTALL:append = " heartbeat"
