<!-- breadcrumb -->
<div class="pt-1">
    <ol class="breadcrumb mt-2">
        <li class="breadcrumb-item active">
            <i class="fas fa-flag"></i>&nbsp; Admin
        </li>
        <?php foreach ($this->uri->segments as $segment): ?>
            <?php
            $url = substr($this->uri->uri_string, 0, strpos($this->uri->uri_string, $segment)) . $segment;
            $is_active =  $url == $this->uri->uri_string;
            ?>

            <li class="breadcrumb-item">
                <a href="<?php echo site_url($url) ?>"><?php echo ucfirst($segment) ?></a>
            </li>
        <?php endforeach; ?>
    </div>
</ol>
