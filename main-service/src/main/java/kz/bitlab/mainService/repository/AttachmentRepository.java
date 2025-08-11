package kz.bitlab.mainService.repository;


import kz.bitlab.mainService.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AttachmentRepository  extends JpaRepository<Attachment, Long> {
}
