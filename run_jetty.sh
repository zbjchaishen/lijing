#!/bin/bash

if [ -z ${log_home} ] ; then
    log_home="/tmp/logs/lijing"

    if [ ! -d ${log_home} ] ; then
        mkdir -p ${log_home}
    fi
fi

export root_dir=$0/..

export GRADLE_OPTS=" -XX:PermSize=128M -XX:MaxPermSize=256m -Xnoagent -Djava.compiler=NONE -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005"

gradle -p $root_dir --no-daemon clean jettyRun -Dconf_client.offline=true -Dapp.name=$(basename $(pwd)) -Dapp.log.home=${log_home} -DhttpPort=8820 -DstopPort=8821
