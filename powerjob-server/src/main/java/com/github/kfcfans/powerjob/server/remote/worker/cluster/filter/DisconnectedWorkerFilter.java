package com.github.kfcfans.powerjob.server.remote.worker.cluster.filter;

import com.github.kfcfans.powerjob.server.extension.WorkerFilter;
import com.github.kfcfans.powerjob.server.persistence.core.model.JobInfoDO;
import com.github.kfcfans.powerjob.server.remote.worker.cluster.WorkerInfo;
import org.springframework.stereotype.Component;

/**
 * filter disconnected worker
 *
 * @author tjq
 * @since 2021/2/19
 */
@Component
public class DisconnectedWorkerFilter implements WorkerFilter {

    @Override
    public boolean filter(WorkerInfo workerInfo, JobInfoDO jobInfoDO) {
        return workerInfo.timeout();
    }
}
