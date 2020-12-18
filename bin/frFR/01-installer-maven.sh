#!/bin/bash
source "$(dirname $0)/00-functions.sh"

#########
# maven #
#########

if [ ! -f /usr/share/doc/maven-parent-*/NOTICE ]; then
	if hash apt-get 2>/dev/null ; then
		computate "sudo apt-get build-dep -y maven"
	fi
	if hash yum 2>/dev/null ; then
		computate "sudo yum-builddep -y maven"
	fi
fi
if ! which mvn > /dev/null; then
	if hash apt-get 2>/dev/null ; then
		computate "sudo apt-get install -y maven"
	fi
	if hash yum 2>/dev/null ; then
		computate "sudo yum install -y maven"
	fi
fi
if [ ! -f /opt/maven/bin/mvn ]; then
	computate "sudo mkdir /usr/local/src/maven /opt/maven-$versionMaven"
	computate "sudo chown $USER: /usr/local/src/maven /opt/maven-$versionMaven"
	computate "git clone https://gitbox.apache.org/repos/asf/maven.git /usr/local/src/maven"
	computate "cd /usr/local/src/maven; git checkout maven-$versionMaven"
	computate "cd /usr/local/src/maven; mvn -DdistributionTargetDir='/tmp/maven-$versionMaven' clean package"
	computate "sudo mv /tmp/maven-$versionMaven /opt/"
	computate "sudo ln -s /opt/maven-$versionMaven/bin/mvn /usr/local/bin/mvn"
fi
