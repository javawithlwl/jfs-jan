package com.careerit.lsj.playerstats;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class PlayerDataMigration {

    private final PlayerDetailsRepo playerDetailsRepo;

    @Transactional
    public List<PlayerDetails> migrate() {
        List<PlayerDetailsDto> playerDetailsDto = getPlayerDetails();
        List<PlayerDetails> playerDetailsList = ConvertorUtil.toEntity(playerDetailsDto);
        log.info("Total records to be migrated : {} ", playerDetailsList.size());
        playerDetailsRepo.deleteAll();
        playerDetailsList = playerDetailsRepo.saveAll(playerDetailsList);
        log.info("Total records migrated : {} ", playerDetailsList.size());
        return playerDetailsList;
    }

    private List<PlayerDetailsDto> getPlayerDetails() {
        return JsonReaderUtil.readJsonFile("/players.json");
    }
}
